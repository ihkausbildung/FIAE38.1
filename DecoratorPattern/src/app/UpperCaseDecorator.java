package app;

public class UpperCaseDecorator extends TextDecorator{


    public UpperCaseDecorator(Text decoText) {
        super(decoText);
    }


    @Override
    public String render(){
       return super.render().toUpperCase();
    }
}
