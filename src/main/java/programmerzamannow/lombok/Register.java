package programmerzamannow.lombok;

import lombok.Value;
import lombok.With;

@Value
//hasil akhir class final dan field final
//immutable class
@With
public class Register {

    String username;

    String password;

}
