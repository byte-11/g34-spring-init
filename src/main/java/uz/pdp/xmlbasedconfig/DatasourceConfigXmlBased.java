package uz.pdp.xmlbasedconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
public class DatasourceConfigXmlBased {
    private String driver;

    private String url;

    private String username;

    private String password;
}
