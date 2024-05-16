import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface TabelaAnotacao {
    String valor();

    long numeroDaSala();

    String[] sala();
}
