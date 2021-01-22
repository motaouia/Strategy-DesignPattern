package org.motaouia.secondexp.strategy;

public class SocialMediaContext {

	private String friendName;

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public void connect(ISocialMediaStrategy socialMediaStrategy) {
		if (getFriendName() != null && this.getFriendName().length() > 0)
			socialMediaStrategy.connectTo(this.getFriendName());
	}
}