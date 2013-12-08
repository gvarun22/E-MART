/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facebook;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Page;
import com.restfb.types.User;

// A class from where FB graph API is called and information regarding the User and E-Mart FB page can be fetched.

public class SimpleTest {

	public static String main(String[] args) {
		
		String me = "tom.holmes.7374"; // FB User Tom Holmes
		String country=null;
		String maleGender=null;
		String output = "Hi, ";
		/*
		* E-Mart Page information fetching
		*/
		
		FacebookClient fbClient = new DefaultFacebookClient();  // No Access Token is used, only publicly visible data is fetched.
		Page me1 = fbClient.fetchObject("724534224224746",com.restfb.types.Page.class); // Page id for E-Mart is given as one of the parameter
		
		System.out.println("Please visit us on Facebook at: "+me1.getLink());
                output = output.concat("Please visit us on Facebook at: "+me1.getLink());
		System.out.println(" and tell your friends about E-Mart.");
                output = output.concat(" and tell your friends about E-Mart." +"<br/>");
		System.out.println("Total number of people who Likes E-Mart : "+me1.getLikes());
                output = output.concat("\n Total number of people who Likes E-Mart : "+me1.getLikes()+ "<br/>");
		System.out.println("\n Total number of people who are talking about E-Mart: "+me1.getTalkingAboutCount());
                output = output.concat("\n Total number of people who are talking about E-Mart: "+me1.getTalkingAboutCount()+ "<br/>");
		//System.out.println("Total number of people who visited E-Mart: "+me1.getCheckins());
		System.out.println("");
		output = output.concat("<br/>");
		/*
		 * User (Tom Holmes) Facebook profile information fetching
		 */
		
		FacebookClient publicOnlyFacebookClient = new DefaultFacebookClient();  // No Access Token is used, only publicly visible data is fetched.
		User me2 = publicOnlyFacebookClient.fetchObject(me,com.restfb.types.User.class); // User Tom Holmes user id is given as one of the parameter
		
		if(me2.getLocale().equals("en_US")){
			country = "2). Please visit our books section to find Books on American History";
		}
		else if(me2.getLocale().equals("en_GB")){
			country = "2). Please visit our books section to find Books on Sherlock Holmes";
		}
		if(me2.getGender().equals("male")){
			maleGender = "1). Please visit our men's clothing section Under Apparel ";
		}
		
		System.out.println("Hi!! Here are few suggestions for you based on your social media activities:");
                output = output.concat("Hi!! Here are few suggestions for you based on your social media activities: <br/>");
		System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println(maleGender);
                output = output.concat(maleGender+ "<br/>");
		System.out.println(country);
                output = output.concat(country+ "<br/>");
		System.out.println("3). You can update your FB profile and tell your friends about EMART here: "+me2.getLink());
                output = output.concat("3). You can update your FB profile and tell your friends about EMART here: "+me2.getLink()+ "<br/>");
		System.out.println("4). If above link is not working you can go to facebook and search for user: '"+me2.getUsername()+"'");
		output = output.concat("4). If above link is not working you can go to facebook and search for user: '"+me2.getUsername()+"'"+ "<br/>");
                return output;
	}
}

