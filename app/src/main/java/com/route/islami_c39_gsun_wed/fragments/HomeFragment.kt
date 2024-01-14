package com.route.islami_c39_gsun_wed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_gsun_wed.R

class HomeFragment : Fragment() {
    // Git & Github (Version Control Systems (VCS))

    // onCreate
    // Activity vs Fragment ->
    //Multiple Fragments

    // Version Control Systems (VCS ) -> Git & Github
    // Project -> Application -> 3 Developers -> bad approach ->

    // Good Approach -> Git & Github ->
    // Side menu -> Version Control Systems
    //  1- Create Git Repository
    //

    // 1- UnVersioned () -> red
    // 2- Ignored Files
    // 3- Versioned Files (Tracked Files) -> Green -> Default

    // Commit -> Save Changes ->
    // initial Commit

    // View Binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
