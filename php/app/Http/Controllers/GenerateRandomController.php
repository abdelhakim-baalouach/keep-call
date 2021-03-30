<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class GenerateRandomController extends Controller
{

    public function show($id)
    {
        return response()->json(rand(), 200);
    }
}
