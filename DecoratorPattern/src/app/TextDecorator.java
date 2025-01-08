package app;

/**
 * public abstract class TextDecorator implements  Text
 * - auch gerne als abstrakte, um unnötige Objekterzeugung zu vermeiden.
 * - abstract -> kein new TextDecorator()
 */
public abstract class TextDecorator implements  Text{

    private Text decoText;


    public TextDecorator(Text decoText) {
        this.decoText = decoText;
    }

    @Override
    public String render() {
        return decoText.render();
    }

}
