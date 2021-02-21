package problem.springframeworknode.ioc;

public class YoungMan {

    private BeautifulGirl beautifulGirl;

    public YoungMan() {
    }

    public BeautifulGirl getBeautifulGirl() {
        return beautifulGirl;
    }

    public void setBeautifulGirl(BeautifulGirl beautifulGirl) {
        this.beautifulGirl = beautifulGirl;
    }
}

class Test {
    public static void main(String[] args) {
        YoungMan you = new YoungMan();
        BeautifulGirl beautifulGirl = new BeautifulGirl("你的各种条件");
        beautifulGirl.setLove("各种投其所好");
        // 然后你有女票了
        you.setBeautifulGirl(beautifulGirl);
    }
}
