package json.chao.com.wanandroid.test;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GithubApi {

    String BASE_URL = "https://api.github.com/";

    @GET("users/{username}")
    Observable<User> getUser(@Path("username") String username);
}