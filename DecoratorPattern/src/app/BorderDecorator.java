package app;

public class BorderDecorator extends TextDecorator{


    public BorderDecorator(Text decoText) {
        super(decoText);
    }


    @Override
    public String render(){
       return "***"+super.render()+"***";
    }
}
