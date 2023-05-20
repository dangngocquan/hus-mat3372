package lab11.iterator.exe02;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendEmail(profile.getEmail(), message);
        }
    }

    private void sendEmail(String email, String message) {
        System.out.printf("Sent to email \"%s\" a message: \"%s\"\n", email, message);
    }
}
