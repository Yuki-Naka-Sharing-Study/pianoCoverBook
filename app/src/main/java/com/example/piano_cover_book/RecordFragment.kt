package com.example.piano_cover_book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.piano_cover_book.databinding.FragmentRecordBinding

class RecordFragment : Fragment() {
    private var _binding: FragmentRecordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        binding.nameOfArtistEditText.setOnEditorActionListener { _, _, _ ->
            // val inputText = binding.editText.text.toString()
            // 入力されたテキストを処理
            // println("入力されたテキスト: $inputText")
            true
        }

        binding.nameOfSongEditText.setOnEditorActionListener { _, _, _ ->
            // val inputText = binding.editText.text.toString()
            // 入力されたテキストを処理
            // println("入力されたテキスト: $inputText")
            true
        }

        binding.memoEditText.setOnEditorActionListener { _, _, _ ->
            // val inputText = binding.editText.text.toString()
            // 入力されたテキストを処理
            // println("入力されたテキスト: $inputText")
            true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}