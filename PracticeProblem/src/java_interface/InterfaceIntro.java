package java_interface;

interface Tossable {
    void toss();
}

class Ball implements Tossable {

    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public void toss() {
        System.out.println(brandName + " ball is tossed.");
    }

    public void bounce() {
        System.out.println(brandName + " ball is bouncing.");
    }
}

class Baseball extends Ball {

    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println(getBrandName() + " baseball is tossed.");
    }

    @Override
    public void bounce() {
        System.out.println(getBrandName() + " baseball is bouncing.");
    }
}

class Football extends Ball {

    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println(getBrandName() + " football is tossed.");
    }

    @Override
    public void bounce() {
        System.out.println(getBrandName() + " football is bouncing.");
    }
}

class Rock implements Tossable {

    @Override
    public void toss() {
        System.out.println("Rock is tossed.");
    }
}

public class InterfaceIntro {

    public static void main(String[] args) {

        Baseball bs = new Baseball("Nike");
        Football fb = new Football("Adidas");
        Rock rk = new Rock();

        bs.toss();
        bs.bounce();

        System.out.println();

        fb.toss();
        fb.bounce();

        System.out.println();

        rk.toss();
    }
}