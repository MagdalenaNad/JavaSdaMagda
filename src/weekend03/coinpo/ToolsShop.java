package weekend03.coinpo;

public class ToolsShop {
    public static void main(String[] args) {
        Hammer hammer=new Hammer("M550d60",79.5, 6);
        Hammer hammer2=new Hammer("M540d25",55.00, 2.5);
        Hammer hammer3=new Hammer("M500d10",19, 1);
        Saw saw1=new Saw("P220k140", 9.99, 14);
        Saw saw2=new Saw("P210k470 ", 49.99, 47);
        Saw saw3=new Saw("P110k780", 129.99, 78);
        Tool[] tools= {hammer, hammer2, hammer3, saw1, saw2, saw3};

        for (Tool tool : tools) {
            System.out.println(tool.showTool());

        }


    }



}
