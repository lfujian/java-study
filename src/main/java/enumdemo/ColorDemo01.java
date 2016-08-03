package enumdemo;

class Color01 {
    public static final Color01 RED = new Color01("红色");
    public static final Color01 GREEN = new Color01("绿色");
    public static final Color01 BLUE = new Color01("蓝色");
    private String name;
    
    private Color01(String name) {
        this.setName(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Color01 getInstance(int i) {
        switch (i) {
            case 1 : {
                return RED;
            }
            case 2 : {
                return GREEN;
            }
            case 3 : {
                return BLUE;
            }
            default : {
                return null;
            }
        }
    }
}

public class ColorDemo01 {
    public static void main(String[] args) {
        Color01 c1 = Color01.RED;
        c1 = Color01.BLUE;
        System.out.println(c1.getName());
        
        Color01 c2 = Color01.GREEN;
        System.out.println(c2.getName());
    }
}
