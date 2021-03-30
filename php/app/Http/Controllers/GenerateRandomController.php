<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class GenerateRandomController extends Controller
{

    public function show($id)
    {
        $data = [
            'random'=> rand(),
            'asset_id' => $id
        ];
        return response()->json($data, 200);
    }
}
