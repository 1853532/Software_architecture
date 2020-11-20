package pkg.zhaoge.ChainofResponsibility;

//巧克力颜色类
class Color{
    public float R;
    public float G;
    public float B;
    public Color(float r, float g, float b) {
        if( (r>255.0f||r<0.0f) || (g>255.0f||g<0.0f) || (b>255.0f||b<0.0f)){
            System.out.println("输入检测到的颜色参数不在0-255范围内！");
            return;
        }
        R = r;
        G = g;
        B = b;
    }
}
// 巧克力物件类
public class chocolategood {
    float width; // 巧克力块宽/cm
    float length; // 巧克力块长度/cm
    float thickness; // 巧克力厚度/mm
    float weight; // 巧克力质量/g
    Color color; // 巧克力颜色
    int type; //巧克力类型 0表示白巧克力，1表示黑巧克力
    int number; // 巧克力编号
    public chocolategood(float width, float length,float thickness ,float weight, Color color, int type,int number) {

        this.width = width;
        this.length = length;
        this.thickness= thickness;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.number=number;
    }
}
