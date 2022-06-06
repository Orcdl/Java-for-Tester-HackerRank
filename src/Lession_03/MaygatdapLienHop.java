package Lession_03;

//Template | Blueprint:
public class MaygatdapLienHop {
    // Focus on: What to solve: dua vao gi? mong muon output la gi?
    // Gom nhom fuction de cung xu ly

    public void gatlua (String caylua) {
        System.out.println("Dang gat" + caylua);

    }
    public void xaylua(String hatlua){
        System.out.println("dang xay" + hatlua);
    }
    public static void main(String[] args) {
        MaygatdapLienHop maygatdapLienHop = new MaygatdapLienHop();
        //. : dot notation
        maygatdapLienHop.gatlua("cay lua");
        maygatdapLienHop.xaylua("hat lua");
    }

}
