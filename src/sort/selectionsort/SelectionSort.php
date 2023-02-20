<?php

declare(strict_types=1);

namespace Sort\SelectionSort;

final class SelectionSort
{
    public static function sort(array $list): array
    {
        $sorted = [];

        $length = count($list);

        for ($index = 0; $index < $length; $index++) {
            $minIndex = self::min($list);

            $sorted[$index] = $list[$minIndex];

            $list = self::copy($list, $minIndex);
        }

        return $sorted;
    }

    private static function min(array $list): int
    {
        $min = min($list);

        return array_search($min, $list);
    }

    private static function copy(array $list, int $remove): array
    {
        $copy = [];

        $length = count($list);

        for ($i = 0; $i < $length; $i++) {
            if ($i === $remove) {
                continue;
            }

            $copy[] = $list[$i];
        }

        return $copy;
    }
}
