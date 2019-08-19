package scb.academy.jinglebell.fragment


import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.view.*

import scb.academy.jinglebell.activity.ProfileActivity
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_profile.*
import scb.academy.jinglebell.R


class ProfileFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val _view = inflater.inflate(R.layout.fragment_profile, container, false)

        _view.editText.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, event ->
            var handled = false
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                /* Write your logic here that will be executed when user taps next button */
                val intent = Intent(context, ProfileActivity::class.java)
                intent.putExtra("nickname", editText.text.toString())
                startActivity(intent)

                handled = true
            }
            handled
        })


        return _view


    }




}
