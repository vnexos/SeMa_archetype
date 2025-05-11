package ${package}.${moduleNameLowerCase};

import com.vnexos.sema.loader.interfaces.AModule;
import com.vnexos.sema.context.ModuleServerContext;
import com.vnexos.sema.loader.annotations.MainClass;

/**
 * Main of module
 */
@MainClass("${moduleName}")
public class ${moduleName}ModuleMain extends AModule {
    public static ModuleServerContext context;
    @Override
    public void onEnabled(ModuleServerContext context) {
        ${moduleName}ModuleMain.context = context;
        context.info("${moduleName} enabled");
    }

    @Override
    public void onDisabled() {
        context.log("${moduleName} disabled");
    }
}
