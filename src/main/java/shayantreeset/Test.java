package shayantreeset;

public class Test {
    public static void main(String[] args) {
    ShayanTreeSet sTree = new ShayanTreeSet();
        System.out.println(sTree.getTreeSet1());
        System.out.println(sTree.getTreeSet2());
        System.out.println("*****");
        System.out.println("union : "+sTree.findUnion(sTree.getTreeSet1(), sTree.getTreeSet2()));

        System.out.println("commons : "+sTree.findCommonChars(sTree.getTreeSet1(), sTree.getTreeSet2()));
    }
}
