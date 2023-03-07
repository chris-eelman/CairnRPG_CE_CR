public class World {
    public static void main(String[] args) {
        World gameName = new World("something", "11 as 1");

    }
    String gameName;
    String publisher;

    public World(String gameName, String publisher) {
        this.gameName = gameName;
        this.publisher = publisher;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
