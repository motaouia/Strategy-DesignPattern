package org.motaouia.secondexp.strategy;

public class DemoSocialStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SocialMediaContext context = new SocialMediaContext();
		context.setFriendName("Ayoub");
		context.connect(new FacebookStrategy());
		System.out.println("===@@@###@@@===");
		
		
		context.setFriendName("Hamza");
		context.connect(new GooglePlusStrategy());
		System.out.println("===@@@###@@@===");
		
		
		context.setFriendName("Faisal");
		context.connect(new TwitterStrategy());
		System.out.println("===@@@###@@@===");
		
		context.setFriendName("Sara");
		context.connect(new OrkutStrategy());
		System.out.println("===@@@###@@@===");
	}

}
