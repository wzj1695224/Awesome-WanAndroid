package json.chao.com.wanandroid.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import json.chao.com.wanandroid.di.component.BaseDialogFragmentComponent;
import json.chao.com.wanandroid.ui.main.fragment.SearchDialogFragment;
import json.chao.com.wanandroid.ui.main.fragment.UsageDialogFragment;



@Module(subcomponents = BaseDialogFragmentComponent.class)
public abstract class AbstractAllDialogFragmentModule {

    @ContributesAndroidInjector(modules = SearchDialogFragmentModule.class)
    abstract SearchDialogFragment contributesSearchDialogFragmentInject();

    @ContributesAndroidInjector(modules = UsageDialogFragmentModule.class)
    abstract UsageDialogFragment contributesUsageDialogFragmentInject();

}
