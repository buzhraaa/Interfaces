interface ContentActions {
    String playContent();
    String pauseContent();
    String stopContent();
}





class Game implements ContentActions {
    private String title;

    public Game(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String playContent() {
        return "Playing game: " + title;
    }

    @Override
    public String pauseContent() {
        return "Pausing game: " + title;
    }

    @Override
    public String stopContent() {
        return "Stopping game: " + title;
    }
}
