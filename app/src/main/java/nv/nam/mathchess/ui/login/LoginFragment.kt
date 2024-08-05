package nv.nam.mathchess.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import nv.nam.mathchess.R

/**
 * @author Nam Nguyen Van
 * Project: Math Chess
 * Created: 31/7/2024
 * Github: https://github.com/Nam0101
 * @description :
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}