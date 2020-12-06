package Lt.Fundamentals.Intro.Task19;

public class Poem { //creator type author puslapiai
    Author creator;
    private int pages;
    public Poem(int pages){
    this.pages = pages;
        System.out.println();
     }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}
