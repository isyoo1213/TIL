package com.example.hello.controller;


import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    //http://localhost:9090/api/get/hello
    public String getHello(){
        return "get Hello!";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    //method 지정안해줄 시 get / post / put / delete 모든 메서드들이 매핑되어 동작
    //http://localhost:9090/api/get/hi
    public String getHi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable{name}
    // 주소에 대문자는 안쓰므로, -를 통해 구분
    // 변화하는 값을 받음. 값이 변화할 때마다 메서드를 만들 순 없음
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName, String name){
        // 파라미터에 annotation을 통해 문자열 name을 받음
        // 기존에 name이라는 변수가 사용될 때는 annotation에 (name = "변수명")을 통해 GetMapping의 변수와 맞춰주고 다른 변수명 사용
        System.out.println("PathVariable : "+pathName);
        return pathName;
    }

    //search?q = intellij
    // &oq = intellij
    // &aqs = chrome..69i57j69i60j69i65j69i60j69i61.2408j0j1
    // &sourceid = chrome
    // &ie = UTF-8
    //?부터가 쿼리. key,value 형식. 그 이후 key, value를 위해 & 연산자 존재.
    //?key=value&key2=value2... 형식
    // http://localhost:9090/api/get/query-param?user=jingny&email=jingny@gmail.com&age=24

    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryparam){

        StringBuilder sb = new StringBuilder();
        queryparam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();

            sb.append(entry.getKey() + " = "+entry.getValue()+"\n");
        });
        return sb.toString();
    }

    //Map으로 받을 때에는 무엇이 들어올지 모르므로 모든 키를 받을 수 있음
    //queryParam.get("name") 이런 식으로 하나씩 다 지정을 해줘야 함
    //그러나 명시적으로 어떤 key들을 받을지 annotation이 붙은 변수로 사용

    // http://localhost:9090/api/get/query-param02?user=jingny&email=jingny@gmail.com&age=24
    @GetMapping(path="query-param02")
    public String queryParam02(
            @RequestParam String user,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(user);
        System.out.println(email);
        System.out.println(age);

        return user+" "+email+" "+age;
    }

    //그러나 위 방법도 변수가 늘어날 때마다 어노테이션을통해 계속 추가해줘야함
    //>dto를 통해서 객체에 유저 리퀘스트 정보를 담은 인스턴스 활용

    // http://localhost:9090/api/get/query-param03?user=jingny&email=jingny@gmail.com&age=24
    @GetMapping(path="query-param03")
    public String queryParam03(UserRequest userRequest
                               ){
        System.out.println(userRequest.getUser());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        //return 위해 UserRequest 클래스에 toString() 메서드 추가
        return userRequest.toString();
    }

}

