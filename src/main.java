
class main {

    public static void main(String[] args) {

        String p[] = { "5 + ) *4 + ( 2 ",
                        "10 + 30 * 5 ",
                        "(20 + 30 ) * 50 ",
                        " (50 + 100 ) / ((15-20) * 25 ",
                        " (30 * (100 - 40 ) + (20 / 20 -5 ) + 65 "

        };


        for (int i = 0; i < p.length; i++) {
            MyProcessor m = new MyProcessor(p[i]);

            if(m.isBalance())
                System.out.println(p[i] + " is valid ");
            else
                System.out.println(p[i] + " is not valid ");


        }

    }

}