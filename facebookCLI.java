import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

import java.net.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class facebookCLI{
    
    private static final String requestedPermissions = "publish_actions";
    private static final String appId = "594356017397992";
    private static final String appSecret = "d7c444b5ea70eacd0a836971b1820610";
    
    public static void main( String args[]) throws FacebookException{
        Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId(appId, appSecret);
        facebook.setOAuthPermissions(requestedPermissions);
        
        System.out.println("Go to:");
        System.out.println("http://www1.chapman.edu/~sherm122/facebook/index.html");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your facebook access token:");
        String accessTokenString = input.nextLine();
        AccessToken at = new AccessToken(accessTokenString);
        facebook.setOAuthAccessToken(at);
        facebook.postStatusMessage("This is a test post for my CPSC 353 final project.");
        }
}