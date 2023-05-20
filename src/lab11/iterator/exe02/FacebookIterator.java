package lab11.iterator.exe02;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {

        }
    }

    @Override
    public Profile getNext() {
        Profile profile = null;
        if (hasNext()) {
            profile = cache[currentPosition];
            currentPosition++;
        }
        return profile;
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return currentPosition < cache.length;
    }
}
