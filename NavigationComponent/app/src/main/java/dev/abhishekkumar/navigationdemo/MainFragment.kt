package dev.abhishekkumar.navigationdemo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main_fragment.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToFirstDestination.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_firstDestination))
        goToSecondDestination.setOnClickListener{
            val valueBundle =Bundle()
            valueBundle.putString("valueArgs",editText.text.toString())
            it.findNavController().navigate(R.id.secondDestination,valueBundle)

        }
    }
}
