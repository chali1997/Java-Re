package Class7;

public interface IJiaoSheng {
    public String jiao();

    public void moFang(IJiaoSheng js);
}

class Gou implements IJiaoSheng {
    private String name;

    public Gou(String name) {
        this.name = name;
    }

    public String jiao() {
        return "汪汪汪";
    }

    public void moFang(IJiaoSheng js) {
        String str = js.jiao();
        System.out.println(str);
    }
}

class Ya implements IJiaoSheng {
    private String name;

    public Ya(String name) {
        this.name = name;
    }

    public String jiao() {
        return "嘎嘎嘎";
    }

    public void moFang(IJiaoSheng js) {
        String str = js.jiao();
        System.out.println(str);
    }
}

class WanJu implements IJiaoSheng {
    private String name;

    public WanJu(String name) {
        this.name = name;
    }

    public String jiao() {
        return null;
    }

    public void moFang(IJiaoSheng js) {
        String str = js.jiao();
        System.out.println(str);
    }
}
