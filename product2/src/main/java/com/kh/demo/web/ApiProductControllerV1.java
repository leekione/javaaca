package com.kh.demo.web;

import com.kh.demo.dao.Product;
import com.kh.demo.svc.ProductSVC;
import com.kh.demo.web.api.ApiResponse;
import com.kh.demo.web.api.product.AddReq;
import com.kh.demo.web.api.product.EditReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j  //log.info()
//@RestController //@Controller + @ResponseBody
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiProductControllerV1 {

    private final ProductSVC productSVC;

    //생성자 주입
//    public ApiProductController(ProductSVC productSVC){
//        this.productSVC = productSVC;
//    }

    //세터메소드 주입
//    @Autowired
//    public void setInstance(ProductSVC productSVC){
//        this.productSVC = productSVC;
//    }
    //등록
//    @ResponseBody
    @PostMapping(value = "/products")
    public ApiResponse<Long> add(@RequestBody AddReq addReq){
        log.info("reqMsg={}",addReq);
        //검증


        //AddReq->Product변환
        Product product = new Product();
        BeanUtils.copyProperties(addReq,product);

        //상품등록
        Long id = productSVC.save(product);
////        Set<Person> persons = new HashSet<>();
////        Map<String,Person> persons = new HashMap<>();
//        List<Person> persons = new ArrayList<>();
//
//        Person p1 = new Person("홍길동",30);
//        persons.add(p1);
////        persons.put("1",p1);
//
//        Person p2 = new Person("홍길순",20);
//        persons.add(p2);
////        persons.put("2",p2);
//        List<Person> persons = new ArrayList<>();
//
//
//        Person p1 = new Person("홍길동",30);
//        Person p2 = new Person("홍길순",20);
//
//        persons.add(p1);
//        persons.add(p2);

        //응답메세지
        ApiResponse.Header header = new ApiResponse.Header("00","성공");
        ApiResponse<Long> response = new ApiResponse<>(header,id);

        return response;
    }


    //조회
 //   @ResponseBody
    @GetMapping("/products/{id}")
    public ApiResponse<Product> findById(@PathVariable("id") Long id){

        //상품조회
        Optional<Product> findedProduct = productSVC.findByProductId(id);

        //응답메세지
        ApiResponse<Product> response =null;
        if(findedProduct.isPresent()){
            Product product = findedProduct.get();

            ApiResponse.Header header = new ApiResponse.Header("00","성공");
            response = new ApiResponse<>(header,product);
        }else{
            ApiResponse.Header header = new ApiResponse.Header("01","찾고자하는 정보가 없습니다.");
           response = new ApiResponse<>(header,null);
        }
        return response;
    }

    //수정
   // @ResponseBody
    @PatchMapping("/products/{id}")
    public ApiResponse<Product> edit(@PathVariable("id") Long id, @RequestBody EditReq editReq){

        //검증
        ApiResponse<Product> response =null;
        Optional<Product> findedProduct = productSVC.findByProductId(id);
        if(findedProduct.isEmpty()){
            ApiResponse.Header header = new ApiResponse.Header("01","수정하고자 하는 상품이 없습니다.");
            response = new ApiResponse<>(header,null);
            return response;
        }

        //EditReq => Product 변환
        Product product = new Product();
        BeanUtils.copyProperties(editReq,product);

        //수정
        productSVC.update(id, product);

        //응답메세지
        ApiResponse.Header header = new ApiResponse.Header("00","성공");
        response = new ApiResponse<>(header, productSVC.findByProductId(id).get());

        return response;
    }

    //삭제
   // @ResponseBody
    @DeleteMapping("/products/{id}")
    public ApiResponse<Product> del(@PathVariable("id") Long id){

        //검증
        ApiResponse<Product> response =null;
        Optional<Product> findedProduct = productSVC.findByProductId(id);
        if(findedProduct.isEmpty()){
            ApiResponse.Header header = new ApiResponse.Header("01","삭제하고자 하는 상품이 없습니다.");
            response = new ApiResponse<>(header,null);
            return response;
        }
        //삭제
        productSVC.deleteByProductId(id);

        //응답메세지
        ApiResponse.Header header = new ApiResponse.Header("00","성공");
        response = new ApiResponse<>(header, null);

        return response;
    }

    //목록
   // @ResponseBody
    @GetMapping("/products")
    public ApiResponse<List<Product>> findAll(){

        List<Product> list = productSVC.findAll();

        //api응답 메세지
        ApiResponse.Header header = new ApiResponse.Header("00","성공");
        ApiResponse<List<Product>> response = new ApiResponse<>(header,list);

        return response;
    }
}
