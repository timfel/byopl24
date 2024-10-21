package de.hpi.swa.lox.runtime;

import java.io.OutputStream;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextReference;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.dsl.Bind;
import com.oracle.truffle.api.nodes.Node;

import de.hpi.swa.lox.LoxLanguage;

@Bind.DefaultExpression("get($node)")
public final class LoxContext {
    private final Env env;

    public LoxContext(LoxLanguage language, TruffleLanguage.Env env) {
        this.env = env;
    }

    private static final ContextReference<LoxContext> REFERENCE = ContextReference.create(LoxLanguage.class);

    public static LoxContext get(Node node) {
        return REFERENCE.get(node);
    }

    public Env getEnv() {
        return env;
    }

    public OutputStream getOutput() {
        return env.out();
    }
}
