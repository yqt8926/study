package onJava.chapt15;

/**
 * @version V1.0.0
 * @description:
 * @packagename: onJava.chapt15
 * @author: yuanqingtao
 * @date: 2024-11-27 22:43
 **/
class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;

    public void dispost() {
        System.out.println("needscleanup" + id + "dispost");
    }
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException {
    }
}

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        } finally {
            nc1.dispost();
        }

        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try{

        }finally {
            nc3.dispost();
            nc2.dispost();
        }

        try {
            NeedsCleanup2 nc4=new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try{
                    //....
                }finally {
                    nc5.dispost();
                }

            } catch (ConstructionException e) {
                System.out.println(e);
            }finally {
                nc4.dispost();
            }
        } catch (ConstructionException e) {
            e.printStackTrace();
        }
    }
}
