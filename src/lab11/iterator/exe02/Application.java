package lab11.iterator.exe02;

public class Application {
    private SocialSpammer spammer;
    private SocialNetwork network;

    private void config() {
        this.network = new Facebook();
        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriend(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}
