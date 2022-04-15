package json.chao.com.wanandroid.contract.navigation;

import java.util.List;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.AbstractView;
import json.chao.com.wanandroid.core.bean.navigation.NavigationListData;



public interface NavigationContract {

    interface View extends AbstractView {

        /**
         * Show navigation list data
         *
         * @param navigationDataList List<NavigationListData>
         */
        void showNavigationListData(List<NavigationListData> navigationDataList);

    }

    interface Presenter extends AbstractPresenter<View> {

        /**
         * Get navigation list data
         *
         * @param isShowError If show error
         */
        void getNavigationListData(boolean isShowError);
    }

}
