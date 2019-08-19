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
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.ProfileActivity


class ProfileFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val _view = inflater.inflate(R.layout.fragment_profile, container, false)

        val editText = _view.findViewById(R.id.editText) as EditText

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                val intent = Intent(context, ProfileActivity::class.java)
                intent.putExtra("nickname", editText.text.toString())
                startActivity(intent)
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {


            }

        })


        return _view


    }




}
