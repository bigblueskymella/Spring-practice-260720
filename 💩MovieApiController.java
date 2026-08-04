package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieApiController {
    // 💡 1단계에서 발급받은 본인의 API 키를 여기에 붙여넣습니다.
    private final String API_KEY = "a726c4e410dc62eb949151b257a54722";

    @GetMapping("/api/movies/search")
    public String searchMovie(@RequestParam final String query) {
        // 스프링에서 외부 API를 호출할 때 사용하는 도구입니다.
        RestTemplate restTemplate = new RestTemplate();

        // 호출할 최종 주소 조립 (한글 검색어 유실 방지를 위해 query 추가)
        String url = "https://api.themoviedb.org/3/search/movie?api_key=" + API_KEY 
                   + "&language=ko-KR&query=" + query;

        // 외부 서버로 GET 요청을 보내고 JSON 결과를 응답 문자열(String)로 통째로 가져옵니다.
        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
