package com.example.piano_cover_book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.piano_cover_book.databinding.FragmentConfirmBinding

class ConfirmFragment : Fragment() {
    private var _binding: FragmentConfirmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConfirmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = listOf<String>()

        if (data.isEmpty()) {
            binding.searchView.visibility = View.GONE
            binding.searchImageView.visibility = View.GONE
            binding.searchEditText.visibility = View.GONE
            binding.musicInfoRecyclerView.visibility = View.GONE

            binding.musicNoteImageView.visibility = View.VISIBLE
            binding.noRecordTextView.visibility = View.VISIBLE
            binding.noRecordDescTextView.visibility = View.VISIBLE
        } else {
            binding.musicNoteImageView.visibility = View.GONE
            binding.noRecordTextView.visibility = View.GONE
            binding.noRecordDescTextView.visibility = View.GONE

            binding.searchView.visibility = View.VISIBLE
            binding.searchImageView.visibility = View.VISIBLE
            binding.searchEditText.visibility = View.VISIBLE
            binding.musicInfoRecyclerView.visibility = View.VISIBLE

        }
    }
}