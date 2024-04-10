package extends1.ex;

public class Album extends Item {

    private String artist;

    public Album(String name, int pirce, String artist) {
        super(name, pirce);
        this.artist = artist;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
