package a59070087.kmitl.ac.th.mobilefinal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class RegisterFragment extends Fragment {
    private EditText _userId, _name, _age, _password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        registerComponents();
    }

    public void registerComponents() {
        _userId = getView().findViewById(R.id.register_inp_user_id);
        _name = getView().findViewById(R.id.register_inp_name);
        _age = getView().findViewById(R.id.register_inp_age);
        _password = getView().findViewById(R.id.register_inp_pwd);
    }
}