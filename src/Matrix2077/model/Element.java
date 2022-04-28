package Matrix2077.model;

public class Element {

    private int x;
    private int y;
    private char type;

    public Element(final int x, final int y) {
        this.x = x;
        this.y = y;
        type = ' ';
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
