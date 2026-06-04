using System.ComponentModel.DataAnnotations;

namespace Frontend.Models;

public class HospitalModel
{
    [Required(ErrorMessage = "Hospital Code is required")]
    [MaxLength(7, ErrorMessage = "Hospital Code cannot exceed 7 characters")]
    public string? hospitalId { get; set; }

    [Required(ErrorMessage = "Hospital Name is required")]
    [MaxLength(100, ErrorMessage = "Hospital Name cannot exceed 100 characters")]
    public string? name { get; set; }

    [Required(ErrorMessage = "Address Line 1 is required")]
    public string? address1 { get; set; }

    public string? address2 { get; set; }

    [Required(ErrorMessage = "State is required")]
    public int? stateId { get; set; }

    public string? stateName { get; set; }

    [Required(ErrorMessage = "City is required")]
    public int? cityId { get; set; }

    public string? cityName { get; set; }

    [Required(ErrorMessage = "Pincode is required")]
    [RegularExpression(@"^[1-9]\d{5}$",
    ErrorMessage = "Please enter a valid 6-digit pincode")]
    public string? pincode { get; set; }

    public string? contactNoLL { get; set; }

    [Required(ErrorMessage = "Contact Person is required")]
    public string? contactPerson { get; set; }

    [Required(ErrorMessage = "Designation is required")]
    public string? contactPersonDesignation { get; set; }

    [Required(ErrorMessage = "Email is required")]
    [EmailAddress(ErrorMessage = "Please enter a valid email")]
    public string? contactPersonEmail { get; set; }

    [Required(ErrorMessage = "Mobile Number is required")]
    [RegularExpression(@"^[6-9]\d{9}$",
    ErrorMessage = "Please enter a valid 10-digit mobile number")]
    public string? contactNoM { get; set; }

    public string? altContactPerson { get; set; }

    public string? altContactPersonDesignation { get; set; }

    [EmailAddress(ErrorMessage = "Please enter a valid email")]
    public string? altContactPersonEmail { get; set; }

    [RegularExpression(@"^[6-9]\d{9}$",
        ErrorMessage = "Please enter a valid 10-digit mobile number")]
    public string? altContactPersonNoM { get; set; }

    [Required(ErrorMessage = "Rate Male is required")]
    public string? rateMale { get; set; }

    [Required(ErrorMessage = "Rate Female is required")]
    public string? rateFemale { get; set; }

    public DateTime? ValidUpto { get; set; }

    public string? concessionInfo { get; set; }

    public string? remarks { get; set; }
}