package pt.ulusofona.deisi.a2020.com.g33.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.OnClick
import pt.ulusofona.deisi.a2020.com.g33.R
import pt.ulusofona.deisi.a2020.com.g33.R.*

class ContactsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(layout.fragment_contacts, container, false)
        ButterKnife.bind(this,view)
        return view
    }

    @OnClick(R.id.sns_phone)
    fun typeSNSPhone(){
        typeCall("tel: +351808242424")
    }

    @OnClick(R.id.social_security_phone)
    fun typeSocialSecPhone(){
        typeCall("tel:+351217929714")
    }

    @OnClick(R.id.gec_telephone)
    fun typeGecTelephone(){
        typeCall("tel: +351 217929714")
    }

    @OnClick(R.id.gec_cellphone)
    fun typeGecCellphone(){
        typeCall("tel: +351 961706472")
    }

    @OnClick(R.id.sns_email)
    fun makeEmailToSNS(){
        makeEmail("atendimento@SNS24.gov.pt")
    }

    @OnClick(R.id.gec_email)
    fun makeEmailToGec(){
        makeEmail("gec@mne.pt")
    }

    @OnClick(R.id.covid19_website)
    fun goToCovidWebsite(){
        goToWebsite("https://covid19.min-saude.pt/")
    }

    @OnClick(R.id.covid_government_rules)
    fun goToCovidRulesWebsite(){
        goToWebsite("https://dre.pt/legislacao-covid-19")
    }

    fun goToWebsite(url: String){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun makeEmail(destination: String){
        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_EMAIL, destination)
        intent.type = "message/rfc822"
        startActivity(intent)
    }

    private fun typeCall(destination: String){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(destination)
        startActivity(intent)
    }

}