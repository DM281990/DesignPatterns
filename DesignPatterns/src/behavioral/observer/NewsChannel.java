package behavioral.observer;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    private void setNews(String news) {
        this.news=news;
    }

    // standard getter and setter
}