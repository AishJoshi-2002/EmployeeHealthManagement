using Frontend.Models;

namespace Frontend.Data;

public static class LocationData
{
    public static List<StateModel> States = new()
    {
        new StateModel { Id = 1, Name = "Andhra Pradesh" },
        new StateModel { Id = 2, Name = "Arunachal Pradesh" },
        new StateModel { Id = 3, Name = "Assam" },
        new StateModel { Id = 4, Name = "Bihar" },
        new StateModel { Id = 5, Name = "Chhattisgarh" },
        new StateModel { Id = 6, Name = "Goa" },
        new StateModel { Id = 7, Name = "Gujarat" },
        new StateModel { Id = 8, Name = "Haryana" },
        new StateModel { Id = 9, Name = "Himachal Pradesh" },
        new StateModel { Id = 10, Name = "Jharkhand" },
        new StateModel { Id = 11, Name = "Karnataka" },
        new StateModel { Id = 12, Name = "Kerala" },
        new StateModel { Id = 13, Name = "Madhya Pradesh" },
        new StateModel { Id = 14, Name = "Maharashtra" },
        new StateModel { Id = 15, Name = "Manipur" },
        new StateModel { Id = 16, Name = "Meghalaya" },
        new StateModel { Id = 17, Name = "Mizoram" },
        new StateModel { Id = 18, Name = "Nagaland" },
        new StateModel { Id = 19, Name = "Odisha" },
        new StateModel { Id = 20, Name = "Punjab" },
        new StateModel { Id = 21, Name = "Rajasthan" },
        new StateModel { Id = 22, Name = "Sikkim" },
        new StateModel { Id = 23, Name = "Tamil Nadu" },
        new StateModel { Id = 24, Name = "Telangana" },
        new StateModel { Id = 25, Name = "Tripura" },
        new StateModel { Id = 26, Name = "Uttar Pradesh" },
        new StateModel { Id = 27, Name = "Uttarakhand" },
        new StateModel { Id = 28, Name = "West Bengal" }
    };

    public static List<CityModel> Cities = new()
    {
        // Andhra Pradesh
        new CityModel { Id = 1, Name = "Visakhapatnam", StateId = 1 },
        new CityModel { Id = 2, Name = "Vijayawada", StateId = 1 },
        new CityModel { Id = 3, Name = "Guntur", StateId = 1 },

        // Arunachal Pradesh
        new CityModel { Id = 4, Name = "Itanagar", StateId = 2 },
        new CityModel { Id = 5, Name = "Tawang", StateId = 2 },

        // Assam
        new CityModel { Id = 6, Name = "Guwahati", StateId = 3 },
        new CityModel { Id = 7, Name = "Silchar", StateId = 3 },
        new CityModel { Id = 8, Name = "Dibrugarh", StateId = 3 },

        // Bihar
        new CityModel { Id = 9, Name = "Patna", StateId = 4 },
        new CityModel { Id = 10, Name = "Gaya", StateId = 4 },
        new CityModel { Id = 11, Name = "Muzaffarpur", StateId = 4 },

        // Chhattisgarh
        new CityModel { Id = 12, Name = "Raipur", StateId = 5 },
        new CityModel { Id = 13, Name = "Bilaspur", StateId = 5 },

        // Goa
        new CityModel { Id = 14, Name = "Panaji", StateId = 6 },
        new CityModel { Id = 15, Name = "Margao", StateId = 6 },

        // Gujarat
        new CityModel { Id = 16, Name = "Ahmedabad", StateId = 7 },
        new CityModel { Id = 17, Name = "Surat", StateId = 7 },
        new CityModel { Id = 18, Name = "Vadodara", StateId = 7 },

        // Haryana
        new CityModel { Id = 19, Name = "Gurugram", StateId = 8 },
        new CityModel { Id = 20, Name = "Faridabad", StateId = 8 },

        // Himachal Pradesh
        new CityModel { Id = 21, Name = "Shimla", StateId = 9 },
        new CityModel { Id = 22, Name = "Manali", StateId = 9 },

        // Jharkhand
        new CityModel { Id = 23, Name = "Ranchi", StateId = 10 },
        new CityModel { Id = 24, Name = "Jamshedpur", StateId = 10 },

        // Karnataka
        new CityModel { Id = 25, Name = "Bengaluru", StateId = 11 },
        new CityModel { Id = 26, Name = "Mysuru", StateId = 11 },
        new CityModel { Id = 27, Name = "Hubli", StateId = 11 },

        // Kerala
        new CityModel { Id = 28, Name = "Kochi", StateId = 12 },
        new CityModel { Id = 29, Name = "Thiruvananthapuram", StateId = 12 },

        // Madhya Pradesh
        new CityModel { Id = 30, Name = "Bhopal", StateId = 13 },
        new CityModel { Id = 31, Name = "Indore", StateId = 13 },

        // Maharashtra
        new CityModel { Id = 32, Name = "Mumbai", StateId = 14 },
        new CityModel { Id = 33, Name = "Pune", StateId = 14 },
        new CityModel { Id = 34, Name = "Nagpur", StateId = 14 },

        // Manipur
        new CityModel { Id = 35, Name = "Imphal", StateId = 15 },

        // Meghalaya
        new CityModel { Id = 36, Name = "Shillong", StateId = 16 },

        // Mizoram
        new CityModel { Id = 37, Name = "Aizawl", StateId = 17 },

        // Nagaland
        new CityModel { Id = 38, Name = "Kohima", StateId = 18 },
        new CityModel { Id = 39, Name = "Dimapur", StateId = 18 },

        // Odisha
        new CityModel { Id = 40, Name = "Bhubaneswar", StateId = 19 },
        new CityModel { Id = 41, Name = "Cuttack", StateId = 19 },

        // Punjab
        new CityModel { Id = 42, Name = "Ludhiana", StateId = 20 },
        new CityModel { Id = 43, Name = "Amritsar", StateId = 20 },

        // Rajasthan
        new CityModel { Id = 44, Name = "Jaipur", StateId = 21 },
        new CityModel { Id = 45, Name = "Jodhpur", StateId = 21 },
        new CityModel { Id = 46, Name = "Udaipur", StateId = 21 },

        // Sikkim
        new CityModel { Id = 47, Name = "Gangtok", StateId = 22 },

        // Tamil Nadu
        new CityModel { Id = 48, Name = "Chennai", StateId = 23 },
        new CityModel { Id = 49, Name = "Coimbatore", StateId = 23 },

        // Telangana
        new CityModel { Id = 50, Name = "Hyderabad", StateId = 24 },
        new CityModel { Id = 51, Name = "Warangal", StateId = 24 },

        // Tripura
        new CityModel { Id = 52, Name = "Agartala", StateId = 25 },

        // Uttar Pradesh
        new CityModel { Id = 53, Name = "Lucknow", StateId = 26 },
        new CityModel { Id = 54, Name = "Kanpur", StateId = 26 },
        new CityModel { Id = 55, Name = "Varanasi", StateId = 26 },

        // Uttarakhand
        new CityModel { Id = 56, Name = "Dehradun", StateId = 27 },
        new CityModel { Id = 57, Name = "Haridwar", StateId = 27 },

        // West Bengal
        new CityModel { Id = 58, Name = "Kolkata", StateId = 28 },
        new CityModel { Id = 59, Name = "Siliguri", StateId = 28 }
    };
}