package org.chodavarapu.datamill.http;

import com.google.common.collect.Multimap;
import org.chodavarapu.datamill.values.Value;
import rx.Observable;

import java.util.function.Function;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface ServerRequest extends Request {
    Value firstTrailingHeader(String header);
    Value firstTrailingHeader(RequestHeader header);
    Observable<Response> respond(Function<ResponseBuilder, Response> responseBuilder);
    Multimap<String, String> trailingHeaders();
}
