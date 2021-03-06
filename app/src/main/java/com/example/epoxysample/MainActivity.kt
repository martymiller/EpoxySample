package com.example.epoxysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setupViews()
	}

	private fun setupViews() {
		val controller = UsersController()
		epoxyRecyclerview.setController(controller)
		controller.setData(User.getSampleUsers())
	}
}