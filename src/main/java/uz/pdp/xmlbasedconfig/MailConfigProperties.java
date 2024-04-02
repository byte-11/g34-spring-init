package uz.pdp.xmlbasedconfig;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MailConfigProperties {
    private final String host;

    private final String port;

    private final String authentication;

    private final String username;

    private final String password;

    private final List<String> defaultReceiver;

    private final Map<String, String> languages;


}
